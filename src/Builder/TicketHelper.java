package Builder;

public class TicketHelper {

    public void  buildAudit(String info){
        System.out.println("构建成年人票逻辑:" + info);
    }

    public void  buildChildrenForSeat(String info){
        System.out.println("构建有座儿童票逻辑:" + info);
    }

    public void  buildChildrenForNoSeat(String info){
        System.out.println("构建无座儿童票逻辑:" + info);
    }

    public void  buildElderly(String info){
        System.out.println("构建有老年人票逻辑:" + info);
    }

    public void  buildSoldier(String info){
        System.out.println("构建军人及家属票逻辑:" + info);
    }

}
