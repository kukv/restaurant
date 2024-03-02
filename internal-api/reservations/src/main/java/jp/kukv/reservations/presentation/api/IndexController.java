package jp.kukv.reservations.presentation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class IndexController {

  @GetMapping("favicon.ico")
  void returnNoFavicon() {}

  IndexController() {}
}
