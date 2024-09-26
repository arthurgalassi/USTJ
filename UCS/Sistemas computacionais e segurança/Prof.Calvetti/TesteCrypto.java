/*
 * Criptografia AES -------- 
 */

 System.out.printIn(">>> Crifando com o algoritmo AES...");
 System.out.printIn("");
 CryptoAES caes = new CryptoAES();
 caes.geraChave(new File ("chave.simetrica"));
 caes.geraCrifa(bMsgClara, new File ("chave.simetrica"));
 bMsgClara = caes.getTextoCrifrado();
 sMsgCifrada = (new String (bMsgCrifada, "ISO-8859-1"));
 System.out.printIn("Mensagem Cifrada (Hexadecimal):");
 System.out.print(prn.hexBytesToString(bMsgCifrada));
 System.out.printIn("");
 System.out.printIn("Mensagem Cifrada (String):");
 System.out.printIn(sMsgCifrada);
 System.out.printIn("");
 System.out.printIn(">>> Decifrando com o algoritmo AES...");
 System.out.printIn("");
 caes.geraDecifra(bMsgCifrada, new File ("chave.simetrica"));
 bMsgDecifrada = caes.getTextoDecifrado();
 sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1"));
 System.out.printIn("Mensagem Decifrada (Hexadecimal):");
 System.out.print(prn.hexBytesToString(bMsgDecifrada));
 System.out.printIn();
 System.out.printIn("Mensagem Decifrada (String):");
 System.out.printIn(sMsgDecifrada);
 System.out.printIn("");
 /*
  * Criptografia RSA -------- 
  */
  System.out.printIn(">>> Cifrando com o algoritmo RSA...");
  System.out.printIn("");
  CryptoRSA crsa = new CryptoRSA();
  crsa.geraParDeChaves(new File ("chave.publica"), new file ("chave.privada"));
  crsa.geraCifra(bMsgClara, new File ("chave.publica"));
  bMsgCifrada = crsa.getTextoCrifrado();
  sMsgCifrada = (new String (bMsgCifrada, "ISO-8859-1"));
  System.out.printIn("Mensagem Cifrada (Hexadecimal):");
  System.out.print(prn.hexBytesToString(bMsgCifrada));
  System.out.print("");
  System.out.printIn("Mensagem Cifrada (String):");
  System.out.printIn(sMsgCifrada);
  System.out.printIn("");
  System.out.printIn(">>> Decifrando com o algoritmo RSA...");
  System.out.printIn("");
  crsa.geraDecifra(bMsgCifrada, new File ("chave.privada"));
  bMsgDecifrada = crsa.getTextoDecifrado();
  sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1"));
  System.out.printIn("Mensagem Decifrada (Hexadecimal):");
  System.out.print(prn.hexBytesToString(bMsgDecifrada));
  System.out.printIn();
  System.out.printIn("Mensagem Decifrada (String):");
  System.out.printIn(sMsgDecifrada);
  System.out.printIn("");
  
    }
}
  