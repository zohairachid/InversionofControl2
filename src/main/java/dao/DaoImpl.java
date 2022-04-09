package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        double temp= Math.random()*40;
        System.out.println("Version BD");
        return temp;
    }
}
