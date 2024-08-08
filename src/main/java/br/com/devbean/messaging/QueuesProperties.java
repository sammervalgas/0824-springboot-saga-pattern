package br.com.devbean.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

@Data
@Component
@AllArgsConstructor
@ConfigurationProperties(prefix = "saga")
public class QueuesProperties {

    private Map<String, String> queues;
    private Map<String, String> dlqs;

    public Map<String, String> getDlqs() {
        return this.getQueues().entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().replace(".queue", ".dlq")
        ));
    }

}
