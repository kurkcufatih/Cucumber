Feature:
  @tekrar
  Scenario:
    Given kullanici "demoUrl" anasayfasina gider
    When kullanici allert uzerinde visible after five seconds yazisini gorur
    And kullanici alert uzerindeki yazinin gorunur oldugunu test eder
    And kullanici ok tusuna basarak alerti kapatir