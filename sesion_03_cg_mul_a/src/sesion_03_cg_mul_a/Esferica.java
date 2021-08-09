package sesion_03_cg_mul_a;

public class Esferica {
private float radio;
private float acimutal;
private float angulo;
public Esferica(float radio, float acimutal, float angulo) {
	super();
	this.radio = radio;//Distancia al origen
	this.acimutal = acimutal;//Angulo que la proyeccion sobre el plano XY\, forma con el eje X
	this.angulo = angulo;//Angulo que el vector de posicion forma con el eje Z.
}
public Esferica cilindrica_esferica(float radio, float angulo,float puntop) {
	float radioe=(float) ( Math.sqrt(Math.pow(radio, 2)+(Math.pow(puntop, 2))));
	float acimutal=angulo;
	float anguloe=(float) Math.atan(radio/puntop);
	return new Esferica(radioe,acimutal,anguloe);
}
public float getRadio() {
	return radio;
}
public void setRadio(float radio) {
	this.radio = radio;
}
public float getAcimutal() {
	return acimutal;
}
public void setAcimutal(float acimutal) {
	this.acimutal = acimutal;
}
public float getAngulo() {
	return angulo;
}
public void setAngulo(float angulo) {
	this.angulo = angulo;
}

}
