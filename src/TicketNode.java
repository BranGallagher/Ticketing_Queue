public class TicketNode {
    String NoTicket;
    String keperluan;


    public TicketNode(String noTicket, String keperluan) {
        NoTicket = noTicket;
        this.keperluan = keperluan;
    }

    public String getNoTicket() {
        return NoTicket;
    }

    public void setNoTicket(String noTicket) {
        NoTicket = noTicket;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }

}
