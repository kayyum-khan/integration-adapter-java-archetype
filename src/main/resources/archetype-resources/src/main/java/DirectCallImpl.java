package ${package};

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * This class contains the implementation of a methods that are to be called
 * using the Direct Call feature.
 *
 * Controller annotation is required to declare a class as a spring Controller.
 *
 * RequestMapping annotation declares the base endpoint URL for direct calls.
 * This means that requests that have the url pattern as specified by the
 * value attribute will be handled by this controller.
 *
 * @see http://static.springsource.org/spring/docs/3.2.2.RELEASE/spring-framework-reference/html/mvc.html#mvc-controller
 */
@Controller
@RequestMapping(value = "/aiq/integration/direct")
public class DirectCallImpl {

    /**
     * This method is implemented to handle Direct Call GET requests. The
     * method takes an incoming picture id query parameter and returns the
     * corresponding picture.
     *
     * RequestMapping annotation is used to define the endpoint url of this
     * method call. This means that the requests that have urls that end with
     * /aiq/integration/direct/picture pattern as specified by the value
     * parameter will be handled by this method. The annotation also has a method
     * attribute which specifies that this method handles get requests. The
     * annotation also has a produces attribute which specifies that this method
     * produces a response of the specified media type.
     *
     * ResponseStatus annotation is used to define the response HTTP status when
     * this method will be invoked.
     *
     * @param pictureId a query parameter sent with the GET request against which
     *                  a picture is to be returned.
     * @return The ResponseEntity with a byte[] body containing the requested
     * picture in bytes.
     */
    @RequestMapping(value = "/picture", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<byte[]> getPicture(@RequestParam("pictureId") String pictureId) {
        /**
         * TODO this is dummy code which emulates the bytes of a picture. In a real
         * scenario, the picture will be fetched from an image store. Please replace
         * appropriatly based on your business logic.
         */
        byte[] picture = new byte[] { 0, 1, 2, 3, 4 };

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<byte[]>(picture, responseHeaders, HttpStatus.OK);
    }
}
