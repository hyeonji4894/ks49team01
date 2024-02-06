package ks49team01.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import ks49team01.common.interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{

		@Value("${files.path}")
		private String filePath;
		
		// DI(의존성 주입)
		private final CommonInterceptor commonInterceptor;
		
		public WebConfig(CommonInterceptor commonInterceptor) {
			this.commonInterceptor = commonInterceptor;
		}
		

		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			
			// 인터셉터: 주소요청을 가로챈다.
			// 정적리소스 주소요청은 제외시킨다.
			registry.addInterceptor(commonInterceptor)
					.addPathPatterns("/**")
					.excludePathPatterns("/admin/assets/**")
					.excludePathPatterns("/admin/dist/**")
					.excludePathPatterns("/branch/assets/**")
					.excludePathPatterns("/branch/dist/**")
					.excludePathPatterns("/common/css/**")
					.excludePathPatterns("/user/assets/**");
			
			WebMvcConfigurer.super.addInterceptors(registry);
		}
		
		/**
		 * 주소요청에 따른 외부파일 경로 설정
		 */
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			String rootPath = getOsRootPath();
			
			registry.addResourceHandler("/resources/**")
					.addResourceLocations(rootPath + filePath + "resources/")
					.setCachePeriod(3600)
					.resourceChain(true)
					.addResolver(new PathResourceResolver());
			WebMvcConfigurer.super.addResourceHandlers(registry);
		} 
		
		/**
		 * os 별 root path 경로 설정
		 * @return root path
		 */
		public String getOsRootPath() {
			String os = System.getProperty("os.name").toLowerCase();
			String rootPath = "";
			if(os.contains("win")) {
				rootPath = "file:///c:";
			}else if(os.contains("mac")) {
				rootPath = "file:///User/Shared";
			}else {
				rootPath = "file://";
			}
			return rootPath;
		}
}
