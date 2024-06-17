package ch.compsteel.componentSupplier.Domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document
public class Data {
    @Id
    private String dataId;
    @Setter
    @Getter
    private Map<String, Object> json;

    public Data(Map<String, Object> json) {
        super();
        this.json = json;
    }
}
