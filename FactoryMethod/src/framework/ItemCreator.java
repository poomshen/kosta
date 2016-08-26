package framework;

public abstract class ItemCreator {
	
	//���丮 �޼��� -> ���ø� �޼��� 
	public Item create() {
		Item item;  // ��ü 
		
		//step1
		requestItemInfo();
		//step2
		item  = createItem();
		//step3
		createItemLog();
		return item;

	}
	//�������� �����ϱ� ���� ������ ���̽����� ������ ������ ��û�մϴ�.
	abstract protected void requestItemInfo();
	//������ ���� ��  ������ ���� ���� �ҹ� �����ϱ� ���� ������ ���̽��� ������ ���� ����� ��� �մϴ�.
	abstract protected void createItemLog();
	//������ �����ϴ� �˰���
	abstract protected Item createItem();
	
}
