public class Longitud {
    
    private double valor;
    
    public Longitud(){
        
    }
    
    public double Kilómetros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return 0;
            }
            else switch (convertir) {
                case "kilómetros":
                    this.valor = valor;
                    break;
                case "hectómetros":
                    this.valor = valor*10;
                    break;
                case "decámetros":
                    this.valor = valor*100;
                    break;
                case "metros":
                    this.valor = valor*1000;
                    break;
                case "decímetro":
                    this.valor = valor*10000;
                    break;
                case "centímetro":
                    this.valor = valor*100000;
                    break;
                case "milímetro":
                    this.valor = valor*1000000;
                    break;
                default:
                    return 0;
            }
        }
        
        return this.valor;
        
    }
    
    public double Hectómetros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return valor;
            }
            else switch (convertir) {
                case "kilómetros":
                    valor = valor/10;
                    break;
                case "hectómetros":
                    valor = valor;
                    break;
                case "decámetros":
                    valor = valor*10;
                    break;
                case "metros":
                    valor = valor*100;
                    break;
                case "decímetro":
                    valor = valor*1000;
                    break;
                case "centímetro":
                    valor = valor*10000;
                    break;
                case "milímetro":
                    valor = valor*100000;
                    break;
                default:
                    return valor;
            }
        }
        else{
            return valor;
        }
        
        return valor;
        
    }
    
    public double Decámetros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return valor;
            }
            else switch (convertir) {
                case "kilómetros":
                    valor = valor/100;
                    break;
                case "hectómetros":
                    valor = valor/10;
                    break;
                case "decámetros":
                    valor = valor;
                    break;
                case "metros":
                    valor = valor*10;
                    break;
                case "decímetro":
                    valor = valor*100;
                    break;
                case "centímetro":
                    valor = valor*1000;
                    break;
                case "milímetro":
                    valor = valor*10000;
                    break;
                default:
                    return valor;
            }
        }
        else{
            return valor;
        }
        
        return valor;
        
    }
    
    public double Metros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return valor;
            }
            else switch (convertir) {
                case "kilómetros":
                    valor = valor/1000;
                    break;
                case "hectómetros":
                    valor = valor/100;
                    break;
                case "decámetros":
                    valor = valor/10;
                    break;
                case "metros":
                    valor = valor;
                    break;
                case "decímetro":
                    valor = valor*10;
                    break;
                case "centímetro":
                    valor = valor*100;
                    break;
                case "milímetro":
                    valor = valor*1000;
                    break;
                default:
                    return valor;
            }
        }
        else{
            return valor;
        }
        
        return valor;
        
    }
    
    public double Decímetros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return valor;
            }
            else switch (convertir) {
                case "kilómetros":
                    valor = valor/10000;
                    break;
                case "hectómetros":
                    valor = valor/1000;
                    break;
                case "decámetros":
                    valor = valor/100;
                    break;
                case "metros":
                    valor = valor/10;
                    break;
                case "decímetro":
                    valor = valor;
                    break;
                case "centímetro":
                    valor = valor*10;
                    break;
                case "milímetro":
                    valor = valor*100;
                    break;
                default:
                    return valor;
            }
        }
        else{
            return valor;
        }
        
        return valor;
        
    }
    
    public double Centímetros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return valor;
            }
            else switch (convertir) {
                case "kilómetros":
                    valor = valor/100000;
                    break;
                case "hectómetros":
                    valor = valor/10000;
                    break;
                case "decámetros":
                    valor = valor/1000;
                    break;
                case "metros":
                    valor = valor/100;
                    break;
                case "decímetro":
                    valor = valor/10;
                    break;
                case "centímetro":
                    valor = valor;
                    break;
                case "milímetro":
                    valor = valor*10;
                    break;
                default:
                    return valor;
            }
        }
        else{
            return valor;
        }
        
        return valor;
        
    }
    
    public double Milímetros(String convertir, double valor){
        
        if(valor != 0){
            if(null == convertir){
                return valor = valor;
            }
            else switch (convertir) {
                case "kilómetros":
                    valor = valor/1000000;
                    break;
                case "hectómetros":
                    valor = valor/100000;
                    break;
                case "decámetros":
                    valor = valor/10000;
                    break;
                case "metros":
                    valor = valor/1000;
                    break;
                case "decímetro":
                    valor = valor/100;
                    break;
                case "centímetro":
                    valor = valor/10;
                    break;
                case "milímetro":
                    valor = valor;
                    break;
                default:
                    return valor;
            }
        }
        else{
            return valor;
        }
        
        return valor;
        
    }
    
}
