package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //Component 어노테이션이 붙은 빈을 자동으로 인식하는데, 그중에서 뺄걸 지정하주는 것.
        //기존 예제코드를 남기기 위해서 이 방법을 사용
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는것이 좋다.
        //왜? 아래처럼 따로 지정하지 않아도 된다.
        //basePackage = "hello.core"
)
public class AutoAppConfig {
}
