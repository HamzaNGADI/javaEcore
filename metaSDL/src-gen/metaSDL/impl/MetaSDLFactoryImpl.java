/**
 */
package metaSDL.impl;

import metaSDL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaSDLFactoryImpl extends EFactoryImpl implements MetaSDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaSDLFactory init() {
		try {
			MetaSDLFactory theMetaSDLFactory = (MetaSDLFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetaSDLPackage.eNS_URI);
			if (theMetaSDLFactory != null) {
				return theMetaSDLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaSDLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSDLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaSDLPackage.PROCESSUS:
			return createProcessus();
		case MetaSDLPackage.BLOCK:
			return createBlock();
		case MetaSDLPackage.SIGNAL:
			return createSignal();
		case MetaSDLPackage.STATE:
			return createState();
		case MetaSDLPackage.CANAL_SYS:
			return createCanalSys();
		case MetaSDLPackage.CANAL_BLOCK:
			return createCanalBlock();
		case MetaSDLPackage.CONNECTION:
			return createConnection();
		case MetaSDLPackage.META_SYS_SDL:
			return createMetaSysSDL();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processus createProcessus() {
		ProcessusImpl processus = new ProcessusImpl();
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanalSys createCanalSys() {
		CanalSysImpl canalSys = new CanalSysImpl();
		return canalSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanalBlock createCanalBlock() {
		CanalBlockImpl canalBlock = new CanalBlockImpl();
		return canalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSysSDL createMetaSysSDL() {
		MetaSysSDLImpl metaSysSDL = new MetaSysSDLImpl();
		return metaSysSDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSDLPackage getMetaSDLPackage() {
		return (MetaSDLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaSDLPackage getPackage() {
		return MetaSDLPackage.eINSTANCE;
	}

} //MetaSDLFactoryImpl
