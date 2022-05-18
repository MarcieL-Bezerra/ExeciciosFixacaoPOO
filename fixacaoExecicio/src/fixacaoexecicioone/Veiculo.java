
package fixacaoexecicioone;

import java.util.Scanner;

public class Veiculo {
    Scanner scan = new Scanner(System.in);
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isIsLigado() {
        return isLigado;
    }

    public void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public void acelerar() {
        if (this.isLigado){
            this.setVelocidade(this.getVelocidade()+ 20);
            System.out.println("velocidade: " + this.getVelocidade());
        }else{
            System.out.println("O carro está desligado");
        }
        }
    public void abastecer(int litrosAbastecidos) {
        if (this.isLigado){
            System.out.println("Favor desligue o carro antes!");
            }else{
                for(int i = 1; i <= litrosAbastecidos; ++i){
                    if (this.getLitrosCombustivel()<60){
                        this.setLitrosCombustivel(i);
                        System.out.println(this.getLitrosCombustivel());
                    }else{
                        int sobra = litrosAbastecidos - this.getLitrosCombustivel();
                        System.out.println("Tanque cheio, sobraram: " + sobra + " litros!");
                        break;
                    }
                }
            }
    }
    
    public void frear() {
        if (this.getVelocidade() > 0){
            this.setVelocidade(this.getVelocidade()-20);
            System.out.println("velocidade: " + this.getVelocidade());
        }else{
            System.out.println("Carro parado!");
        }
        }
    
    public void pintar(String cor) {
        this.setCor(cor);
        System.out.println("Carro pintado de " + this.getCor());
        
    }
    
    public void ligar() {
        if (this.isLigado){
            System.out.println("O carro já estava ligado!");
        }else{
            this.setIsLigado(true);
            System.out.println("Rumm ... Carro ligado");
            
        }
        
    }
    public void desligar() {
        if (this.isLigado){
            if (this.getVelocidade()==0){
                this.setIsLigado(false);
                System.out.println("Carro desligado!");
            }else{
                System.out.println("Favor pare o carro antes, esse carro não aceita banguela!");
            }
        }else{
            System.out.println("Carro não está ligado");
            
        }
        
    }
    
}
