package at.kaindorf.intro.web;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.awt.geom.Point2D;

@RestController
@RequestMapping(path = "/service")
public class HomeService {

    //@RequestMapping(method = RequestMethod.GET, path = ("/"))
    @GetMapping("/")
    public String hello(@RequestParam(name = "to", defaultValue = "5AHIF", required = true) String to) {
        return "Hello " + to;
    }

    @GetMapping("/{id}")
    public Point2D getPoint (@PathVariable("id") int id) {
        return switch (id) {
            case 1 -> new Point2D.Double(2.0, 5.6);
            case 2 -> new Point2D.Double(10.0, 7.6);
            default -> new Point2D.Double(0, 0);
        };
    }
}
