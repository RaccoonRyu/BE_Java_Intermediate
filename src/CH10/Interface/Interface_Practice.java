package CH10.Interface;

// 추상 클래스
abstract class GreenOrc {
    // 상수
    public final String SKIN_COLOR = "녹색";
    // 변수
    public int health;
    public int attackDamage;
    public int defense;

    // 추상 메서드
    public abstract void setHealth();
    public abstract void setAttackDamage();
    public abstract void setDefense();
}

// NPC, User 인터페이스
interface NPCSystem {
    // 추상 메서드
    public abstract void conversationSystem();
    public abstract void questionSystem();
}

interface UserSystem {
    // 추상 메서드
    public abstract void partySystem();
    public abstract void tradeSystem();
}

// OrkNPC1 클래스 (그린오크 클래스 상속, NPC 인터페이스 사용)
class OrkNPC1 extends GreenOrc implements NPCSystem {
    @Override
    public void setHealth() {
        this.health = 100;
    }

    @Override
    public void setAttackDamage() {
        this.attackDamage = 10;
    }

    @Override
    public void setDefense() {
        this.defense = 5;
    }

    @Override
    public void conversationSystem() {
        System.out.println("안녕");
        System.out.println("요즘 새로운 소식 없나요?");
    }

    @Override
    public void questionSystem() {
        System.out.println("새로운 퀘스트");
        System.out.println("퀘스트 완료");
    }
}

// OkrUser1 클래스 (그린오크 클래스 상속, USER 인터페이스 사용)
class OrkUser1 extends GreenOrc implements UserSystem {
    @Override
    public void setHealth() {
        this.health = 200;
    }

    @Override
    public void setAttackDamage() {
        this.attackDamage = 20;
    }

    @Override
    public void setDefense() {
        this.defense = 10;
    }

    @Override
    public void partySystem() {
        System.out.println("파티 초대");
        System.out.println("파티 수락");
    }

    @Override
    public void tradeSystem() {
        System.out.println("거래 신청");
        System.out.println("거래 완료");
    }
}


public class Interface_Practice {
    public static void main(String[] args) {
        // Test Code
        // 추상 클래스와 인터페이스 등을 이용하여 파생 클래스를 작성하는 예제
    }
}
