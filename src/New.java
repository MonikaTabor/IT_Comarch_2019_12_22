import java.util.Random;

public class New {
    public static void main(String[] args) {
        Client[] clientTab = new Client[10];

        String[] namePool = {"Jan", "Janusz", "Pawel", "Roman", "Patryk", "Ahmed" };
        String[] surnamePool = {"Kowalski", "Malinowski", "Bereda", "Nowak", "Los", "Albudalowicz" };
        long[] peselPool = {123456789L, 123456784L, 123456785L, 123456782L, 123456783L, 123456781L};

        for (int i = 0; i < clientTab.length; i++) {
            Client client = new Client();
            Random random = new Random();
            client.name = namePool[random.nextInt(6)];
            client.surname = surnamePool[random.nextInt(6)];
            client.pesel = peselPool[random.nextInt(6)];
            client.age = random.nextInt(73) + 18;
            if (random.nextInt(2) == 0) {
                client.sex = 'M';
            } else {
                client.sex = 'K';
            }
            clientTab[i] = client;
        }
        for (Client temporaryClient : clientTab) {
            System.out.println(temporaryClient.name);
            System.out.println(temporaryClient.surname);
            System.out.println(temporaryClient.age);
            System.out.println(temporaryClient.pesel);
            System.out.println(temporaryClient.sex);

        }
    }
}
