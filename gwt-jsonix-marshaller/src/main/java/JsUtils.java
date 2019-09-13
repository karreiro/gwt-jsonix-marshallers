import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.xml.namespace.QName;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;


/**
 * Utility class to provide generic methods used by all specific JSInterop classes
 * 
 */
public class JsUtils {


    private JsUtils() {
         //Private constructor to prevent instantiation
    }

    public static<D >void add(final JsArrayLike<D> jsArrayLike, final D element) {
        int length = jsArrayLike.getLength();
        jsArrayLike.setLength((length + 1));
        jsArrayLike.setAt(length, element);
    }

    public static<D >void addAll(final JsArrayLike<D> jsArrayLike, D... elements) {
        for (D element: elements) {
            JsUtils.add(jsArrayLike, element);
        }
    }

    public static<D >void remove(final JsArrayLike<D> jsArrayLike, final int index) {
        int targetIndex = 0;
        for (int sourceIndex = 0; (sourceIndex<jsArrayLike.getLength()); sourceIndex ++) {
            if (sourceIndex!= index) {
                jsArrayLike.setAt(targetIndex ++, jsArrayLike.getAt(sourceIndex));
            }
        }
        jsArrayLike.setLength(targetIndex);
    }

    public static<D >List<D> toList(final JsArrayLike<D> jsArrayLike) {
        final List<D> toReturn = new ArrayList<D>();
        if (Objects.nonNull(jsArrayLike)) {
            for (int i = 0; (i<jsArrayLike.getLength()); i ++) {
                final D toAdd = Js.uncheckedCast(jsArrayLike.getAt(i));
                toReturn.add(toAdd);
            }
        }
        return toReturn;
    }

    /**
     * Extracts the <b>otherAttributes</b> property from a JavaScriptObject to a <i>regular</i> Java Map.
     * 
     * @param original
     *      <b>js object</b> to transform.
     * @return
     *     the populated <code>Map&lt;QName, String&gt;</code>
     */
    public static Map<QName, String> toAttributesMap(final Object original) {
        final Map<QName, String> toReturn = new HashMap<QName, String>();
        toAttributesMap(toReturn, original);
        return toReturn;
    }

    /**
     * Create a <code>QName</code> instance from the given <b>qNameAsString</b>, and the use it as key for a new entry on <b>destination</b> Map.
     * 
     * @param destination
     *      the <code>Map</code> to populate.
     * @param qNameAsString
     *      the <code>String</code> to transform to <code>QName</code> instance used as key.
     * @param value
     *      the <b>value</b> to be used in the new entry.
     */
    private static void putToAttributesMap(final Map<QName, String> destination, final String qNameAsString, final String value) {
        destination.put(QName.valueOf(qNameAsString), value);
    }
    
    public static native <D> JsArrayLike<D> getUnwrappedElementsArray(final JsArrayLike<D> original) /*-{
        var toReturn = [];
        if(original != null) {
            toReturn = original.map(function (arrayItem) {
                var retrieved = arrayItem.value
                var toSet = retrieved == null ? arrayItem : retrieved
                console.log(toSet);
                return toSet;
            });
        }
        return toReturn;
    }-*/;

    public static native Object getUnwrappedElement(final Object original) /*-{
        var toReturn = original.value;
        var toSet = toReturn == null ? original : toReturn;
        console.log(toSet);
        return toSet;
    }-*/;

    private static native void toAttributesMap(final Map<QName, String> toReturn,
                                               final Object original) /*-{
        var keys = Object.keys(original);
        for (var i = 0; i < keys.length; i++) {
            var key = keys[i];
            var value = original[key];
            @.JsUtils::putToAttributesMap(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)(toReturn, key, value);
        }
    }-*/;

    public static native <D> D newInstance(final Class<D> klass) /*-{
        return {"TYPE_NAME": klass.TYPE}
    }-*/;

    public static native String getTypeName(final Object instance) /*-{
        return instance.TYPE_NAME
    }-*/;

}
