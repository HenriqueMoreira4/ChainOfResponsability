import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {
 
    @Test
    public void teste(){
        Cliente infoPessoalXml = new InfoPessoal();
        Cliente infoEmpresaXml =  new InfoEmpresa(infoPessoalXml);
        assertEquals(infoEmpresaXml,infoEmpresaXml);
    }

}