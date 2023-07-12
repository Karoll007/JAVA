package controle;

public class Controle implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Metodo construtor
	
	public Controle (){
		this.setVolume( 50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	//Metodos especias
	
	private int getVolume() {
		return this.volume;
	}
	private void setVolume (int v) {
		this.volume = v;
	}
	private boolean getLigado() {
		return this.ligado;
	} 
	private void setLigado (boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return this.tocando;
	}
	private void setTocando (boolean tocando) {
		this.tocando = tocando;
		
		//Metodos abstratos
	}
	@Override
	public void ligar() {
		this.ligado = true;
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("--+--+-MENU-+--+--");
	System.out.println("Esta ligado?" +this.getLigado());
	System.out.println("Esta tocando?" + this.tocando);
	System.out.print("Volume: " + this.getVolume());
	for(int i = 0; i <= this.getVolume();i+=10){
	System.out.print("|");	
	} 
		}

	@Override
	public void fecharMenu() {
	System.out.println(" Fechando menu...");
		
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+1); 
		}	
	}

	@Override
	public void ligarMudo() {
		if(this.ligado && this.getVolume()>0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume()==0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
	}

