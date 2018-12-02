package com.thd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.thd.framework.dao.BaseRepositoryFactoryBean;
import com.thd.framework.redis.RedisConfig;




//囊括@SpringBootConfiguration @EnableAutoConfiguration  @ComponentScan   三个注释
@SpringBootApplication(scanBasePackages = "com.thd")

//开启自动配置功能  以前我们需要配置的东西,Spring Boot帮我们自动配置
//如果有@SpringBootApplication 则下面注释可不写
//@EnableAutoConfiguration

//开启扫描@Component,@Controller,@Service,@Repository
//如果有@SpringBootApplication(scanBasePackages = "com.thd") 下面的注释可不写
//是以前的<context:component-scan>
//@ComponentScan(basePackages = {"com.thd"})

//注明这个类是个配置文件 继承自@Configuration，二者功能也一致  和以前的xml配置是等效的
//如果有@SpringBootApplication 则下面注释可不写
//@SpringBootConfiguration

//------------------  servlet filter listener -----------------//
//开启扫描@WebServlet,@WebListener,@WebFilter 
//等同于在web.xml中配置servlet,监听器,过滤器   Scanning for Servlets, Filters, and listeners
//@ServletComponentScan


// ------------------  hibernate -----------------//
//@EnableJpaRepositories
//扫描hibernate实体
//@EntityScan(basePackages="com.thd")
//开启扫描@Transactional   数据库事务 
@EnableTransactionManagement

//------------------  加载配置文件 -----------------//
@PropertySource(value={"classpath:config/application.yml"},encoding="utf-8") 


//开启缓存
@EnableCaching

/**
 * 我们使用通用repository时
 * 我们需要让spring在加载的时候找到我们自定义的BaseRepositoryFactoryBean的工厂，
 * 只要在入口类中加入@EnableJpaRepositories即可，代码如下
 */
@EnableJpaRepositories(basePackages = {"com.thd.framework.dao","com.thd.project.dao"},repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)//我们自己的工厂
@Import(RedisConfig.class)
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
	
	
	
	public static void main(String[] args) {
		//System.setProperty("spring.devtools.restart.enabled", "false");
	    SpringApplication.run(Application.class, args);
	}
	
	
	
}
