package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double temp = 80;
        return temp;
    }
}
