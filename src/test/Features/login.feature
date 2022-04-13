Feature: Kayıtlı kullanıcının sepete ürün eklemesi

  Scenario: Kayıtlı kullanıcı siteye giriş yapar. ürün arar ve bulduğu ürünü seçer, sepetine ürünü ekler.
    Given Kullanıcının bilgileri sitede kayıtlıdır.
    And   Kullanıcı siteye giriş yapar.
    When Kullanıcı sitede ürün aramak için textbox'a ürün adını yazar.
    And  Arama butonuna basar.
    Then Kullanıcı arama sonucuna göre filtrelenen sayfaya ulaşır.
    When Kullanıcı seçtiği bir ürüne tıklar.
    Then Kullanıcı ürün detaylarının olduğu sayfaya yönlendirilir.
    When Kullanıcı ürünü sepete ekler.



