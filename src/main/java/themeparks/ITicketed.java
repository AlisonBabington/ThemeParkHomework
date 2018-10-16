package themeparks;

public interface ITicketed {

    double defaultPrice();
    double priceFor(Visitor visitor);
}
