public class PayAdapter implements InLeiTransaction{
    private French f;
    public PayAdapter(French f){
        this.f=f;
    }

    @Override
    public void payInLei() {
        f.payInEuro();
        System.out.println("French: I managed to finalize my transaction! :)");
    }
}
