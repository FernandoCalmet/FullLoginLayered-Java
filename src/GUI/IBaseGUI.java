package GUI;
/**
 *
 * @author Fernando Calmet <github.com/fernandocalmet>
 */
public interface IBaseGUI 
{
    public void cargarDatos();
    public void seleccionarDatos();
    public void limpiarSeleccion();
    public void bloquearCampos();
    public void desbloquearCampos();
    public void bloquearBotones();
    public void desbloquearBotones();
    public void filtroBusqueda();
    public void cargarFiltro();
    public void cargarGrupoRadioBotones();
}