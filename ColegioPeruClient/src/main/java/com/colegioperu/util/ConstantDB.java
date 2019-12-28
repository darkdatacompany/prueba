package com.colegioperu.util;


public class ConstantDB {

	public static final String POINT = ".";	
	public static final String SCH_COLEGIO 			 = "colegioperudb";
	public static final String PCK_COLEGIO_REPORTES  = "PCK_COLEGIO_REPORTES";
	
	/* Verify their use before of delete above lines */
	public static final String TYPE_PCK_ARR_EVENT    = "ARR_EVENT";
	public static final String TYPE_PCK_ARR_DOCUMENT = "ARR_DOCUMENT";
	public static final String TYPE_PCK_ARR_IMPRESOS = "ARR_IMPRESOS";
	
	public static final String SQL_TYPE_IMPRESORA 	 = "OBJ_IMPRESORA";
	public static final String SQL_TYPE_CONFIGURATOR = "OBJ_CONFIGURATOR";
	public static final String SQL_TYPE_EVENTO       = "OBJ_EVENT";
	public static final String SQL_TYPE_DOCUMENTO    = "OBJ_DOCUMENT";
	public static final String SQL_TYPE_IMPRESOS     = "OBJ_IMPRESOS";
	/* End of verify...*/
	
	
	//NAME OF THE PROCEDURES OF DATABASE colegioperudb replaace
	public static final String SP_LIST_STUDENTS          			= "SP_LIST_STUDENTS";
	public static final String SP_GET_STUDENT          				= "SP_GET_STUDENT";
	
	public static final String PROC_LISTAR_CONFIGURADOR        		= "LISTAR_CONFIGURADOR";
	public static final String PROC_FILTRAR_CONFIGURADOR       		= "FILTRAR_CONFIGURADOR";
	public static final String PROC_OBTENER_DATOS_CONFIGURADOR 		= "OBTENER_DATOS_CONFIGURADOR";
	public static final String PROC_VERIFICAR_CONFIGURADOR	   		= "VERIFICAR_CONFIGURADOR";
	public static final String PROC_AGREGAR_CONFIGURADOR	   		= "AGREGAR_CONFIGURADOR";
	public static final String PROC_MODIFICAR_CONFIGURADOR	   		= "MODIFICAR_CONFIGURADOR";
	public static final String PROC_ELIMINAR_CONFIGURADOR      		= "ELIMINAR_CONFIGURADOR";
	public static final String PROC_LISTAR_PRODUCTOS           		= "LISTAR_PRODUCTOS";
	public static final String PROC_LISTAR_PARAMETROS          		= "LISTAR_PARAMETROS";
	public static final String PROC_LISTAR_EVENTOS_X_PRODUCTO  		= "LISTAR_EVENTOS_X_PRODUCTO";
	public static final String PROC_LISTAR_PRODUCT_EVENT_DOC   		= "LISTAR_PRODUCT_EVENT_DOC";
	public static final String PROC_LISTAR_RAMOS               		= "LISTAR_RAMOS";
	public static final String PROC_LISTAR_SUBRAMOS            		= "LISTAR_SUBRAMOS";
	public static final String PROC_LISTAR_ESTADOS_POLIZA      		= "LISTAR_ESTADOS_POLIZA";
	public static final String PROC_LISTAR_PLAN    			   		= "LISTAR_PLAN";
	public static final String PROC_LISTAR_TIPO_DOCUMENTO	   		= "LISTAR_TIPO_DOCUMENTO";
	public static final String PROC_LISTAR_PRODUCTOS_X_SUBRAMO 		= "LISTAR_PRODUCTOS_X_SUBRAMO";
	public static final String PROC_REGISTRAR_CONFIGURADOR 	   		= "REGISTRAR_CONFIGURADOR";
	public static final String PROC_OBTENER_ID_IMPRESIONES     		= "OBTENER_ID_IMPRESIONES"; 
	public static final String PROC_BUSCAR_IMPRESIONES  	   		= "BUSCAR_IMPRESIONES";
	public static final String PROC_LISTAR_NRO_IMPRESIONES 	   		= "LISTAR_NRO_IMPRESIONES";
	public static final String PROC_LISTAR_AGENCIAS			   		= "LISTAR_AGENCIAS";
	public static final String PROC_LISTAR_AGENTES			   		= "LISTAR_AGENTES";
	public static final String PROC_REGISTRAR_IMPRESIONES	   		= "REGISTRAR_IMPRESIONES";
	//End of replace
	
	//NAME OF PROCEDURES OF PACKAGE REPORTS replace
	public static final String PROC_CREAR_OPENITEMS_TEMPORALES 		= "CREAR_OPENITEMS_TEMPORALES";
	public static final String PROC_BORRAR_OPENITEMS_TEMPORALES 	= "BORRAR_OPENITEMS_TEMPORALES";
	public static final String PROC_LISTAR_ESTADOCUENTA		   		= "LISTAR_ESTADOCUENTA";
	public static final String PROC_OBTENER_CAPITAL_ACUMULADO  		= "OBTENER_CAPITAL_ACUMULADO";
	public static final String PROC_OBTENER_COBERTURAS_CONTRATADAS	= "OBTENER_COBERTURA_CONTRATADAS";
	public static final String PROC_OBTENER_DATOS_CONTRATANTE		= "OBTENER_DATOS_CONTRATANTE";
	public static final String PROC_OBTENER_DATOS_POLIZA			= "OBTENER_DATOS_POLIZA";
	public static final String PROC_OBTENER_TOTAL_PAGOS_EFECTUADOS	= "OBTENER_TOTAL_PAGOS_EFECTUADOS";
	public static final String PROC_PROCESAR_ESTADOCUENTA			= "PROCESAR_ESTADOCUENTA";
	public static final String PROC_PROCESAR_PAGOS_ESTADOCUENTA		= "PROCESAR_PAGOS_ESTADOCUENTA";
	//End of replace
    
	protected ConstantDB() {
		throw new UnsupportedOperationException();
	}
}