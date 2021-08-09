package sesion_03_cg_mul_a;

public class Cilindrica {
private float radio;
private float puntop;
private float acimutal;
public Cilindrica(float radio, float puntop, float azimutal) {
	super();
	this.radio = radio;//radio base cilindrica
	this.puntop = puntop;// Valor de la coordenada Z
	this.acimutal = acimutal;// Angulo respecto de X de la proyeccion del punto sobre el plano XY
}
public Cilindrica esferica_cilindrica(float radio, float angulo,float acimutal) {
	float radioc=(float) (radio*Math.sin(angulo));
	float anguloc=angulo;
	float puntoz=(float) (radio*Math.cos(angulo));
	return new Cilindrica(radioc,anguloc,puntoz);
}
public float getRadio() {
	return radio;
}
public void setRadio(float radio) {
	this.radio = radio;
}
public float getPuntop() {
	return puntop;
}
public void setPuntop(float puntop) {
	this.puntop = puntop;
}
public float getAcimutal() {
	return acimutal;
}
public void setAcimutal(float azimutal) {
	this.acimutal = acimutal;
}

}
