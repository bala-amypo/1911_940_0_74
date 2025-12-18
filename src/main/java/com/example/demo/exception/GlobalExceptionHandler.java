

@restControllerAdvice
public calss GlobalExceptionHandler{
    @ExceptionHandler(ResourceNotFoundException.class){
        public ResponseEntity <String> handleNotFound(ResourceNotFoundException ex){
            return new 
        }
    }
}