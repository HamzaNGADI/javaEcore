/**
 */
package metaSDL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canal Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.CanalBlock#getProcessus <em>Processus</em>}</li>
 *   <li>{@link metaSDL.CanalBlock#getCanalblock <em>Canalblock</em>}</li>
 *   <li>{@link metaSDL.CanalBlock#getId <em>Id</em>}</li>
 *   <li>{@link metaSDL.CanalBlock#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see metaSDL.MetaSDLPackage#getCanalBlock()
 * @model
 * @generated
 */
public interface CanalBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Processus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processus</em>' reference.
	 * @see #setProcessus(Processus)
	 * @see metaSDL.MetaSDLPackage#getCanalBlock_Processus()
	 * @model
	 * @generated
	 */
	Processus getProcessus();

	/**
	 * Sets the value of the '{@link metaSDL.CanalBlock#getProcessus <em>Processus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processus</em>' reference.
	 * @see #getProcessus()
	 * @generated
	 */
	void setProcessus(Processus value);

	/**
	 * Returns the value of the '<em><b>Canalblock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canalblock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canalblock</em>' reference.
	 * @see #setCanalblock(CanalBlock)
	 * @see metaSDL.MetaSDLPackage#getCanalBlock_Canalblock()
	 * @model
	 * @generated
	 */
	CanalBlock getCanalblock();

	/**
	 * Sets the value of the '{@link metaSDL.CanalBlock#getCanalblock <em>Canalblock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canalblock</em>' reference.
	 * @see #getCanalblock()
	 * @generated
	 */
	void setCanalblock(CanalBlock value);

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
	 * @see metaSDL.MetaSDLPackage#getCanalBlock_Signal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignal();

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
	 * @see metaSDL.MetaSDLPackage#getCanalBlock_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link metaSDL.CanalBlock#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CanalBlock
