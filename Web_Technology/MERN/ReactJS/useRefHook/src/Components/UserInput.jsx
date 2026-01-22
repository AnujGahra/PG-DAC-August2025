// import React from 'react'
// import { forwardRef } from 'react'

// function UserInput(props, ref) {
//   return (
//     <div>
//         <input type="text" ref={ref} />
//     </div>
//   )
// }

// export default forwardRef(UserInput);

// after react 19 version
const UserInput = (props) => {
    return (
        <div>
            <input type="text" ref={props.ref} />
        </div>
    )
};
export default UserInput;