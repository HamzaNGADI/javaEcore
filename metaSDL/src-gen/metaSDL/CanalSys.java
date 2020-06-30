/**
 */
package metaSDL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canal Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.CanalSys#getCanalsys <em>Canalsys</em>}</li>
 *   <li>{@link metaSDL.CanalSys#getId <em>Id</em>}</li>
 *   <li>{@link metaSDL.CanalSys#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see metaSDL.MetaSDLPackage#getCanalSys()
 * @model
 * @generated
 */
public interface CanalSys extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getCanalSys_Signal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignal();

	/**
	 * Returns the value of the '<em><b>Canalsys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canalsys</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canalsys</em>' reference.
	 * @see #setCanalsys(CanalSys)
	 * @see metaSDL.MetaSDLPackage#getCanalSys_Canalsys()
	 * @model
	 * @generated
	 */
	CanalSys getCanalsys();

	/**
	 * Sets the value of the '{@link metaSDL.CanalSys#getCanalsys <em>Canalsys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canalsys</em>' reference.
	 * @see #getCanalsys()
	 * @generated
	 */
	void setCanalsys(CanalSys value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see metaSDL.MetaSDLPackage#getCanalSys_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link metaSDL.CanalSys#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CanalSys
