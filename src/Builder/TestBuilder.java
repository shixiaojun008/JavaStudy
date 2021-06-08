package Builder;

public class TestBuilder {

    public static void main(String[] args) {

        TicketHelper helper = new TicketHelper();

        helper.buildAudit("成人票");

        helper.buildChildrenForSeat("有座儿童");

        helper.buildChildrenForNoSeat("无座儿童");

        helper.buildElderly("老人票");

        helper.buildSoldier("军人票");

        Object ticket = TicketBuilder.builder(helper);

    }

}
