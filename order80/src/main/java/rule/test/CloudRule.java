package rule.test;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: zangsh
 * Date: 2020/12/8
 * Description:
 */
@Configuration
public class CloudRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
