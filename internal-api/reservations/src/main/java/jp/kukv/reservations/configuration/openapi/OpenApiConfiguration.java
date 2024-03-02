package jp.kukv.reservations.configuration.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.servers.Server;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springdoc.core.utils.SpringDocUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class OpenApiConfiguration {

  static {
    Schema<LocalDateTime> localDateTimeSchema = new Schema<>();
    localDateTimeSchema.example(
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    SpringDocUtils.getConfig().replaceWithSchema(LocalDateTime.class, localDateTimeSchema);

    Schema<LocalTime> localTimeSchema = new Schema<>();
    localTimeSchema.example(LocalTime.now().format(DateTimeFormatter.ISO_TIME));
    SpringDocUtils.getConfig().replaceWithSchema(LocalTime.class, localTimeSchema);
  }

  @Bean
  OpenAPI openAPI() {
    OpenAPI openAPI = new OpenAPI();
    openAPI.setComponents(new Components());
    openAPI.setInfo(info());
    openAPI.servers(servers());

    return openAPI;
  }

  private Info info() {
    Contact contact = new Contact();
    contact.setName("koki nonaka");
    contact.setEmail("koki-nonaka@outlook.jp");
    contact.setUrl("https://bright-room.net");

    Info info = new Info();
    info.setTitle("internal-api/reservations");
    info.setDescription("飲食店予約API");
    info.setContact(contact);
    info.setVersion("0.0.1");
    return info;
  }

  private List<Server> servers() {
    List<Server> servers = new ArrayList<>();

    Server localServer = new Server();
    localServer.setUrl("http://localhost:8080");
    localServer.setDescription("Local");
    servers.add(localServer);

    return servers;
  }

  @Bean
  ModelResolver modelResolver(ObjectMapper objectMapper) {
    return new ModelResolver(objectMapper);
  }
}
