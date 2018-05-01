package Collections;

/**
 * Created by taoLen on 4/29/2018.
 */
public class Masina {
    int x;
    Motor motor = this.new Motor();

    public class Motor{
        void ruleaza(){x++;}
    }
    void motorulRuleaza(){motor.ruleaza();}
}
