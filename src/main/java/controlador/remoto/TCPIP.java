package controlador.remoto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import comun.TerminalVista;
import tipo.Color;
import tipo.Error;

public class TCPIP extends TerminalVista {
	
	private ServerSocket servidor;
	
	private Socket socket;
	
	private PrintWriter escritura; 
	
	private BufferedReader lectura;
	
	public TCPIP(Socket socket) {
		this.servidor = null;
		this.socket = socket;
		try {
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			this.escritura = new PrintWriter(out);
			this.lectura = new BufferedReader(new InputStreamReader(in));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public TCPIP(ServerSocket servidor, Socket socket) {
		this(socket);
		this.servidor = servidor;
	}
	
	public static TCPIP crearSocketCliente() {
		try {
			Socket socket = new Socket("localhost", 2020);
			System.out.println("Cliente> Establecida conexión.");
			return new TCPIP(socket);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static TCPIP crearSocketServidor() {
		try {
			ServerSocket servidor = new ServerSocket(2020);
			System.out.println("Servidor> Esperando conexión...");
			Socket socket = servidor.accept();
			System.out.println(
					"Servidor> Recibida conexion de "
					+ socket.getInetAddress().getHostAddress() + ":"
					+ socket.getPort());
			return new TCPIP(servidor, socket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void desconectar() {
		try {
			this.escribir(Trama.DESCONECTAR.name());
			lectura.close();
			escritura.close();
			socket.close();
			if (servidor != null) {
				servidor.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String leer() {
		String linea = null;
		try {
			linea = lectura.readLine();
		} catch (IOException e) {
			System.out.println("Error en servidor!!! Lectura de string");
		}
		return linea;
	}
	
	public boolean leerBooleano() {
		boolean resultado = false;
		try {
			resultado = Boolean.parseBoolean(lectura.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public int leerEntero() {
		int resultado = -1;
		try {
			resultado = Integer.parseInt(lectura.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public void escribir(Color color) {
		if (color == null) {
			this.escribir("null");
		}else {
			this.escribir(color.name());			
		}
	}

	public void escribir(Error error) {
		if (error == null) {
			this.escribir("null");
		}else {
			this.escribir(error.name());
		}
	}

	public Error recibirError() {
		String error = this.leer();
		if (error.equals("null")) {
			return null;
		}
		return Error.valueOf(error);
	}

	public Color recibirColor() {
		String color = this.leer();
		if (color.equals("null")) {
			return null;
		}else {
			return Color.valueOf(color);			
		}
	}
	
	public void escribir(int valor) {
		escritura.println("" + valor);
		escritura.flush();
	}
	
	public void escribir(boolean valor) {
		escritura.println("" + valor);
		escritura.flush();
	}
	
	public void escribir(String valor) {
		escritura.println(valor);
		escritura.flush();
	}
	
	

}

