
### struktura
- Warstwowa struktura:
- Controller - przyjmowanie zapytań i wypluwanie odpowiedzi
- Service - logika biznesowa
- Repository - połączenie z bazą danych
- Każde entity będzie miało swoje 3-warstwowe flow:
- Pokój (id, numer, rozmiar, cena, lista zwierząt)
- Zwierzę (id, imie, gatunek, wiek, pokój)
- Klient (id, imie, nazwisko, lista zwierząt)

### funkcjonalności
- wylistowanie pokoi
- wylistowanie zwierząt
- wylistowanie klientów
- dodawanie pokoju (dodając pokój, chcemy mieć możliwość wybrania rozmiaru) - guzik na liście pokoi
- dodawanie zwierzęcia (wybór klienta z listy dostępnych) - guzik na liście zwierząt
- dodawanie klienta (dodając klienta, chcemy mieć możliwość wybrania kilku zwierząt jednocześnie) - guzik na liście klientów
- usuwanie pokoju (soft delete) - guzik na liście pokoi
- usuwanie zwierzęcia (soft delete) - guzik na liście zwierząt
- usuwanie klienta (soft delete) - guzik na liście klientów
- przydzielanie zwierzęcia do pokoju (walidujemy/sprawdzamy rozmiar pokoju) - guzik na liście zwierząt
- zmiana ceny pokoju - guzik na liście pokoi

### wtkonanie
1. Stworzyć projekt w Java za pomocą frameworku Spring i narzędzia Maven.

2. Stworzyć trzy warstwy aplikacji: Controller, Service i Repository.

3. Stworzyć klasy dla entity: Pokój, Zwierzę, Klient.

4. W warstwie Repository utworzyć interfejsy odpowiedzialne za operacje z bazą danych dla każdego z entity.

5. W warstwie Service utworzyć klasy implementujące te interfejsy, które będą zawierać logikę biznesową aplikacji.

6. W warstwie Controller utworzyć kontrolery odpowiedzialne za przyjmowanie zapytań i wypluwanie odpowiedzi.

7. Dodać funkcjonalności do aplikacji, takie jak: wylistowanie pokoi, zwierząt, klientów, dodawanie pokoju, zwierzęcia, klienta, usuwanie pokoju, zwierzęcia, klienta, przydzielanie zwierzęcia do pokoju, zmiana ceny pokoju, zmiana klienta dla zwierzęcia.

8. Dodać walidację/sprawdzanie danych przed dodaniem/zmianą.

9. Dodać soft delete dla pokoju, zwierzęcia, klienta.

10. Przetestować aplikację i poprawić ewentualne błędy.




