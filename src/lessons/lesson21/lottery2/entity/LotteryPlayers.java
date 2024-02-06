package lessons.lesson21.lottery2.entity;

public class LotteryPlayers {

    private LotteryTicket[] tickets;

    public LotteryPlayers(int numberOfPlayers) {

        this.tickets = new LotteryTicket[numberOfPlayers];
    }

    public LotteryTicket[] getTickets() {

        return tickets;
    }
}
