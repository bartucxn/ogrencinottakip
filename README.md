


Bu proje Spring Boot kullanılarak geliştirilmiş bir web uygulamasıdır ve MySQL veritabanına bağlanmaktadır. Amacı öğrenci notlarını takip etmek ve yönetmektir.

Model: Veritabanındaki tabloları temsil eden sınıflar (örneğin Student).

Repository: Veritabanı işlemleri için arayüzler (Spring Data JPA kullanılır).

Service: İş mantığının yazıldığı katman.

Controller: HTTP isteklerini karşılayıp, işlemleri başlatan katman.

Kaynaklar: application.properties dosyası veritabanı ayarlarını içerir.

Uygulama kullanıcıdan gelen istekleri Controller’da karşılar, Service katmanına iletir ve Repository aracılığıyla veritabanı işlemlerini yapar. Sonuçlar tekrar Controller’dan kullanıcıya döner.

Projede katmanlı mimari kullanılmıştır, bu sayede kodlar düzenli ve yönetimi kolaydır.
