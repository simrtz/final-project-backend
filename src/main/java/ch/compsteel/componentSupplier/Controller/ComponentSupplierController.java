package ch.compsteel.componentSupplier.Controller;

import ch.compsteel.componentSupplier.Domain.Data;
import ch.compsteel.componentSupplier.Domain.DataRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/component")
public class ComponentSupplierController {

    private DataRepository dataRepository;

    @PostMapping("/extremelySecureDefinitelyNotMaliciousUploadOfDataThisEndpointIsOnlyToEnsureSecurity")
    public ResponseEntity<Map<String, Object>> uploadComponent(@RequestBody Map<String, Object> json) {
        System.out.println("Received JSON: " + json);

        dataRepository.save(new Data(json));

        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
