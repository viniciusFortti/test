package br.com.forttiori.poatransportes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
       /* RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter =
                new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(
                Arrays.asList(
                        MediaType.APPLICATION_JSON,
                        MediaType.APPLICATION_OCTET_STREAM));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);


        Onibus onibus = restTemplate.getForObject("http://www.poatransporte.com.br/php/facades/process.php?a=nc&p=1713-2&t=o", Onibus.class);
        onibus.toString();
*/



    }

}
