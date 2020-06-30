/**
 */
package metaSDL.impl;

import java.util.Collection;

import metaSDL.Block;
import metaSDL.CanalBlock;
import metaSDL.MetaSDLPackage;
import metaSDL.Processus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.impl.BlockImpl#getCanalblock <em>Canalblock</em>}</li>
 *   <li>{@link metaSDL.impl.BlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link metaSDL.impl.BlockImpl#getProcessus <em>Processus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The cached value of the '{@link #getCanalblock() <em>Canalblock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalblock()
	 * @generated
	 * @ordered
	 */
	protected EList<CanalBlock> canalblock;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessus() <em>Processus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessus()
	 * @generated
	 * @ordered
	 */
	protected EList<Processus> processus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaSDLPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processus> getProcessus() {
		if (processus == null) {
			processus = new EObjectContainmentEList<Processus>(Processus.class, this, MetaSDLPackage.BLOCK__PROCESSUS);
		}
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanalBlock> getCanalblock() {
		if (canalblock == null) {
			canalblock = new EObjectContainmentEList<CanalBlock>(CanalBlock.class, this,
					MetaSDLPackage.BLOCK__CANALBLOCK);
		}
		return canalblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.BLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaSDLPackage.BLOCK__CANALBLOCK:
			return ((InternalEList<?>) getCanalblock()).basicRemove(otherEnd, msgs);
		case MetaSDLPackage.BLOCK__PROCESSUS:
			return ((InternalEList<?>) getProcessus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaSDLPackage.BLOCK__CANALBLOCK:
			return getCanalblock();
		case MetaSDLPackage.BLOCK__ID:
			return getId();
		case MetaSDLPackage.BLOCK__PROCESSUS:
			return getProcessus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaSDLPackage.BLOCK__CANALBLOCK:
			getCanalblock().clear();
			getCanalblock().addAll((Collection<? extends CanalBlock>) newValue);
			return;
		case MetaSDLPackage.BLOCK__ID:
			setId((String) newValue);
			return;
		case MetaSDLPackage.BLOCK__PROCESSUS:
			getProcessus().clear();
			getProcessus().addAll((Collection<? extends Processus>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaSDLPackage.BLOCK__CANALBLOCK:
			getCanalblock().clear();
			return;
		case MetaSDLPackage.BLOCK__ID:
			setId(ID_EDEFAULT);
			return;
		case MetaSDLPackage.BLOCK__PROCESSUS:
			getProcessus().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaSDLPackage.BLOCK__CANALBLOCK:
			return canalblock != null && !canalblock.isEmpty();
		case MetaSDLPackage.BLOCK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MetaSDLPackage.BLOCK__PROCESSUS:
			return processus != null && !processus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
