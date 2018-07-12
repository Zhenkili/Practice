package demo.lzq.practiceforspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PracticeForSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeForSpringBootApplication.class, args);
    }

    @RequestMapping(value="/",produces = "text/plain;charset=UTF-8")
    String Index(){
        return "hello I wanna read " + bookname +" which is wriiten by" + bookauthor +"and the part is "+ booksubname;
    }

    @Value(value="${book.name}")
    private String bookname;
    @Value(value="${book.author}")
    private String bookauthor;
    @Value(value="${book.subname}")
    private String booksubname;

}
