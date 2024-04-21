package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("mainDiscountPolicy") //빈이름을 바꾸는게 아닌, 부가적인 이름을 설정해줌
//Primary 와 Qualifier 중 뭐가 우선순위가 높을까? -> Qualifier가 우선순위가 더 높다. 보통 더 상세하게 작동하면 우선순위가 더 높다
//@Primary
//@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    //ctrl + shift + t 테스트 클래스 만들기
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
