/**
 */
package metaSDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Sys SDL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.MetaSysSDL#getCanalsys <em>Canalsys</em>}</li>
 *   <li>{@link metaSDL.MetaSysSDL#getBlock <em>Block</em>}</li>
 *   <li>{@link metaSDL.MetaSysSDL#getSignal <em>Signal</em>}</li>
 *   <li>{@link metaSDL.MetaSysSDL#getProcessus <em>Processus</em>}</li>
 *   <li>{@link metaSDL.MetaSysSDL#getNameSys <em>Name Sys</em>}</li>
 * </ul>
 *
 * @see metaSDL.MetaSDLPackage#getMetaSysSDL()
 * @model
 * @generated
 */
public interface MetaSysSDL extends EObject {
	/**
	 * Returns the value of the '<em><b>Canalsys</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.CanalSys}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canalsys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canalsys</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getMetaSysSDL_Canalsys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CanalSys> getCanalsys();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getMetaSysSDL_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlock();

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getMetaSysSDL_Signal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Signal> getSignal();

	/**
	 * Returns the value of the '<em><b>Processus</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.Processus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processus</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getMetaSysSDL_Processus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processus> getProcessus();

	/**
	 * Returns the value of the '<em><b>Name Sys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Sys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Sys</em>' attribute.
	 * @see #setNameSys(String)
	 * @see metaSDL.MetaSDLPackage#getMetaSysSDL_NameSys()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNameSys();

	/**
	 * Sets the value of the '{@link metaSDL.MetaSysSDL#getNameSys <em>Name Sys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Sys</em>' attribute.
	 * @see #getNameSys()
	 * @generated
	 */
	void setNameSys(String value);

} // MetaSysSDL
