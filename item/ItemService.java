package item;

public interface ItemService {
	// setter의 의미
	public void addCart(Item item);

	// getter의 의미
	public Item[] list();
}
