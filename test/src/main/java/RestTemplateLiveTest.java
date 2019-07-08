import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import testerepos.LoginForm;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
public class RestTemplateLiveTest {

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void givenRestTemplate_whenRequested_thenLogAndModifyResponse() {
        LoginForm loginForm = new LoginForm("username", "password");
        HttpEntity<LoginForm> requestEntity
                = new HttpEntity<LoginForm>(loginForm);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity
                = restTemplate.postForEntity(
                "http://localhost:8080/usuarios/", requestEntity, String.class
        );

        assertThat(
                responseEntity.getStatusCode(),
                is(equalTo(HttpStatus.OK))
        );
        assertThat(
                responseEntity.getHeaders().get("new-header").get(0),
                is(equalTo("add"))
        );
    }
}

