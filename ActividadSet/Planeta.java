public class Planeta extends CuerpoCeleste{
    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste cuerpo) {
        if (cuerpo.getTipoCuerpo()==TipoCuerpoCeleste.LUNA) {
            addSatelite(cuerpo);
            return true;
        }
        return false;
    }
}
