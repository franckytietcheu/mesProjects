package cm.connect.technology.lotostudio.conn590.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
class SpringFoxConfig {
    @Bean
    fun api(): Docket? {
        return Docket(DocumentationType.OAS_30)
            .select()
            .apis(RequestHandlerSelectors.basePackage("cm.connect.technology.lotostudio.conn590.controllers"))
            .paths(PathSelectors.regex("/.*"))
            .build().apiInfo(apiEndPointsInfo())
    }

    private fun apiEndPointsInfo(): ApiInfo? {
        return ApiInfoBuilder().title("Conn game 5/90")
            .description("")
            .contact(Contact("Wilfried BOBIONGONO", "", "wilfried@moobifun.com"))
            .license("Copyright CTI 2023, all rights reserved")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("0.0.2")
            .build()
    }
}