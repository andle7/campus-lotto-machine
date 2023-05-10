package lotto_machine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModelDTO {
		private static Scanner input = new Scanner(System.in);
		private String print;
		private int lotto[];
		private int number[][];
		private int money;
		private int times;
		private int passivity;
		private int auto;
		private int number_6;
		private int number_5;
		private int number_4;
		private int number_3;
		private int total_money;
		private double revenue;
		private boolean check;
		

		public ModelDTO() {
			//System.out.println("ModelDTO() ������ ȣ���!");
			this.total_money = 0;
			this.number_6 = 0;
			this.number_5 = 0;
			this.number_4 = 0;
			this.number_3 = 0;
			this.revenue = 0.0;
			this.lotto = new int[6];
			this.check = false;
		}
		
		public int getTotal_money() {
			return total_money;
		}

		public void setTotal_money(int total_money) {
			this.total_money = total_money;
		}
		
		public int getNumber_6() {
			return number_6;
		}

		public void setNumber_6(int number_6) {
			this.number_6 = number_6;
		}

		public int getNumber_5() {
			return number_5;
		}

		public void setNumber_5(int number_5) {
			this.number_5 = number_5;
		}

		public int getNumber_4() {
			return number_4;
		}

		public void setNumber_4(int number_4) {
			this.number_4 = number_4;
		}

		public int getNumber_3() {
			return number_3;
		}

		public void setNumber_3(int number_3) {
			this.number_3 = number_3;
		}
		
		public double getRevenue() {
			return revenue;
		}

		public void setRevenue(double revenue) {
			this.revenue = revenue;
		}
		
		public int getnumber_6() {
			return number_6;
		}

		public void setnumber_6(int number_6) {
			this.number_6 = number_6;
		}
		
		public int getAuto() {
			return auto;
		}

		public void setAuto(int auto) {
			this.auto = auto;
		}
		
		public int getPassivity() {
			return passivity;
		}

		public void setPassivity(int passivity) {
			this.passivity = passivity;
		}
		
		public boolean isCheck() {
			return check;
		}

		public void setCheck(boolean check) {
			this.check = check;
		}

		public int getTimes() {
			return times;
		}

		public void setTimes(int times) {
			this.times = times;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public int[] getLotto() {
			return lotto;
		}

		public void setLotto(int[] lotto) {
			this.lotto = lotto;
		}

		public int[][] getNumber() {
			return number;
		}

		public void setNumber(int[][] number) {
			this.number = number;
		}
		
		
		public String getPrint() {
			System.out.println("[�������] " + print);
			
			while (true) {
				
				try {
					selectSwitch();
						
				} catch (InputMismatchException e) {
					System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�!");
					input = new Scanner(System.in);
				}
				
			}	
		
			//return print;
		}
		
		
		public void setPrint(String print) {
			this.print = print;
		}
	
		
		public void selectSwitch() {
			
			Menu();
			
			int n = 0;
			
			while(true) {
			
				n = input.nextInt();
				
				switch(n) {
			
					case 1:
						System.out.println("=====<�ζ� ����>=====");
						input();
						
						System.out.println("=======<��û ��ȣ>=====");
						randGame();
						gameView();
						
						compare();
						check = false;
						Menu();
						break;
					case 2:	
						valueOf();
						Menu();
						break;
					case 3:
						System.out.println("������ ���ӿ� ���� ���ͷ� �Դϴ�.");
						System.out.println("�ؼ��ͷ��� ���� ���� ���� �ʱ�ȭ �˴ϴ�.");
						System.out.println("���ͷ�: ");
						this.total_money += this.number_6*2000000000;
						this.total_money += this.total_money + (this.number_5*1500000);
						this.total_money += this.total_money + (this.number_4*50000);
						this.total_money += this.total_money + (this.number_3*5000);
						revenue = (double)this.total_money/this.times;
						System.out.println(revenue);
						Menu();
						break;
					case 4:
						System.out.println("���� ����~!!!");
						this.number_6 = 0;
						this.number_5 = 0;
						this.number_4 = 0;
						this.number_3 = 0;
						Menu();
						break;
					case 5:
						input.close();
						System.out.println("���α׷��� ���������� ����!");
						System.exit(0);
					default:
						System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
						Menu();
			
				}
			}
		
			
		}
		
		public void valueOf() {
			System.out.println("==========<<��÷ �� �ݾ�>>==========");
			System.out.println("3�� ��ġ �� ���:5,000��");
			System.out.println("4�� ��ġ �� ���:50,000��");
			System.out.println("5�� ��ġ �� ���: 1,500,000��");
			System.out.println("6�� ��ġ ���: 2,000,000,000�� (20��)");
			System.out.println("===============================");
			
			System.out.println("�����α׷��� ���ư��� ������ ��÷ ����Դϴ�.");
			System.out.println("�ذ��� �޴����� ������ �����մϴ�~!.");
			System.out.println("��÷ ���: ");
			System.out.println("1�� " + this.number_6 + "��");
			System.out.println("3�� " + this.number_5 + "��");
			System.out.println("4�� " + this.number_4 + "��");
			System.out.println("5�� " + this.number_3 + "��");
		}
		
		public void Menu() {
			System.out.println("=========<�� ��>========");
			System.out.println("1���� ������ �ζǰ����� �����մϴ�.");
			System.out.println("2���� ������ ��÷ ��踦 Ȯ���մϴ�.");
			System.out.println("3���� ������ ���ͷ��� Ȯ���մϴ�.");
			System.out.println("4���� ������ ���� ���� �մϴ�.");
			System.out.println("5���� ������ ���α׷��� �����մϴ�.");
			System.out.println("======================");
			System.out.println("�Է�:");
		}
		
		
		public void randGame() {
		
			//System.out.println("�ζ� ��ȣ : ");
			for (int i = 0; i < this.lotto.length; i++) {
				int num = (int) (Math.random() * 45) + 1;
				this.lotto[i] = num;
				for (int j = 0; j < i; j++) {
					if (this.lotto[i] == this.lotto[j]) {
						i--;
						break;
					}
				}

			}
		}
		
		public void gameView() {
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(this.lotto[i] + " ");
			}
			
			System.out.println();
		}
		
		
		public void input() {
			this.revenue = 0; //���ͷ� �ٽ� �ʱ�ȭ
			
			while(true) {
				try {
					System.out.println("�ζ� ������ ������ �ݾ��� �Է����ּ���(�ζ� ���忡 1000��):");
					this.money = input.nextInt();
				
					if(this.money % 1000 == 0) {
		
						break;
					}
					
					else if(this.money % 1000 != 0){
						System.out.println("���� �ݾ��� 1000�� ������ �ƴմϴ�.");
					}

				} catch (InputMismatchException e) {
					input = new Scanner(System.in);
					System.out.println("�߸��� �Է�! �ݾ��� �߸� �Է��ϼ̽��ϴ�!");
				}
			}
			
			this.times = this.money/1000; 
		
			this.number = new int[this.times][6];
			
			System.out.println("��" + this.times + "��");
			
			passivty_Game();
			passivity_view();
			auto_Game();
			auto_view();
		}

		public void passivty_Game() {
			//���� ����
			while (true) {
				try {
					input = new Scanner(System.in);

					System.out.println("���� �� ��?");
					this.passivity = input.nextInt();
					System.out.println("���� " + this.passivity + "��");
					break;
					// input = new Scanner(System.in);
				} catch (InputMismatchException e) {
					System.out.println("�߸��� �Է�!");
				}
			}
			passivity_Ex();

			
			
		}
		
		public void passivity_Ex() {
				
				int count = 0;
				
				try {

					if (this.passivity > 0) {
						System.out.println("�ζ� ��ȣ 6���� �Է��� �ּ���!");
					}

					for (int i = 0; i < this.passivity; i++) {
						for (int j = 0; j < lotto.length; j++) {
							//this.number[i][j] = (Integer) null;
							this.number[i][j] = input.nextInt();
							if(this.number[i][j] > 45 || this.number[i][j] <= 0) {
								System.out.println("1 ~ 45 ������ ���ڸ� �Է� �����մϴ�.");
								//input = new Scanner(System.in);
								count++;
								break;
								
							}
							
						}
						
					}
					
					
				} catch (InputMismatchException e) {
					input = new Scanner(System.in);
					passivity_Ex();
				}
				
				if(count == 1) {
					passivity_Ex();
					count--;
				}
				
				
			}
		
		public void passivity_view() {
			// ���� ��
			for (int i = 0; i < this.passivity; i++) {
				System.out.print("[" + (i+1) + "] ");
				for(int j = 0; j < lotto.length; j++) {
					System.out.print(this.number[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		public void auto_Game() {
			//�ڵ� ����
			this.auto = this.times - this.passivity;
			System.out.println("�ڵ� " + this.auto + "��");
		
			
		}
		
		public void auto_view() {
			//�ڵ� ��
			
			for(int i = 0; i<this.times-this.passivity; i++) {
				randGame();
		
					for(int j = 0; j<lotto.length; j++)
						this.number[i+this.passivity][j] = this.lotto[j];
				System.out.print("[" + (i+this.passivity+1) + "] ");
				gameView();
			}
		}
		
		
		
		public void compare() {
			
			System.out.println("-----<result>-----");
			
			int count = 1;
			
			for (int i = 0; i < this.times; i++) {
					count = 1;
				for(int j = 0; j<lotto.length; j++) {
					if (this.number[i][j] != this.lotto[j]) {
						//System.out.println("��÷�Ǽ̽��ϴ�!");
						
						break;
					}
					else {
						if(count == 6) {
							check = true;
							System.out.println("[" + (i+1) + "] "+ "��÷�Ǽ̽��ϴ�!");
							this.number_6++;
							//break;
					}
				}
					
					if(count == 5) {
						check = true;
						this.number_5++;
					}
					else if(count ==4) {
						check = true;
						this.number_4++;
					}
					else if(count ==3) {
						check = true;
						this.number_3++;
					}
					count++;
				}
			}
			
			
			
			if(this.check == false) {
				System.out.println("���� ��!!!");
			}
		}
		
		
}
		
	
	