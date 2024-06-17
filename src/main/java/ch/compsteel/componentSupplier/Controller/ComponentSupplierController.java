package ch.compsteel.componentSupplier.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/component")
public class ComponentSupplierController {

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/upload")
    public ResponseEntity<Map<String, Object>> uploadComponent(@RequestBody Map<String, Object> json) {

        System.out.println("Received JSON: " + json);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
